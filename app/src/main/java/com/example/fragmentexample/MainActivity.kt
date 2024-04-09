package com.example.fragmentexample

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.fragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 뷰바인딩 사용
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            fragment1Btn.setOnClickListener{
                setFragment(FirstFragment())
            }
            fragment2Btn.setOnClickListener {
                setFragment(SecondFragment())
            }
        }

        // MainActivity실행되자마자 나타날 프레그먼트
        setFragment(FirstFragment())
    }

    private fun setFragment(frag : Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, frag)
            .commit()
    }


}