package com.example.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.authentication.api.model.response.GoogleResponseBody
import com.example.authentication.api.model.response.Profile
import com.example.authentication.api.utils.Resource
import com.example.authentication.auth.presentation.viewModels.AuthViewModel
import com.example.authentication.databinding.FragmentProfileBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private val authViewModel: AuthViewModel by activityViewModels()

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private val authStateObserver = Observer<Resource<GoogleResponseBody>> { state ->
        when (state) {
            is Resource.Loading -> {
                binding.progressBar.visibility = View.VISIBLE
                binding.authButton.isEnabled = false
            }
            is Resource.Success -> {
                binding.progressBar.visibility = View.GONE
                binding.authButton.isEnabled = true
                showSuccess(state.data?.message ?: "Signed in successfully")
                saveUserProfile(state.data?.data?.profile)
            }
            is Resource.Error -> {
                binding.progressBar.visibility = View.GONE
                binding.authButton.isEnabled = true
                showError(state.message ?: "An error occurred")
            }
            else -> {

            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        authViewModel.authState.observe(viewLifecycleOwner, authStateObserver)

        if (authViewModel.isUserLoggedIn()) {
            showSuccess("User already logged in.")
        } else {
            binding.authButton.setOnClickListener {
                googleSignIn()
            }
        }

        binding.signOutButton.setOnClickListener {
            signOut()
        }
    }

    private fun googleSignIn() {
        val context = requireContext()
        authViewModel.googleSignIn(context)
    }

    private fun signOut() {
        authViewModel.signOut()
        showSuccess("User signed out successfully")
    }

    private fun showSuccess(message: String) {
       Toast.makeText(context,"You have become part of family",Toast.LENGTH_LONG).show()
    }

    private fun showError(message: String) {

        Toast.makeText(context,"Check yoour interet Connection",Toast.LENGTH_LONG).show()
    }

    private fun saveUserProfile(profile: Profile?) {
        profile?.let {
            authViewModel.saveProfile(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
