package org.d3ifcool.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.d3ifcool.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var nilaia = 0
    private var nilaib = 0
    private var nilaiaa = 0
    private var nilaibb = 0
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.bUpleft.setOnClickListener {
            nilaia +=3
            binding.tvHasil1.text= nilaia.toString()
        }
        binding.bUpright.setOnClickListener {
            nilaib +=3
            binding.tvHasil2.text= nilaib.toString()
        }
        binding.bUpmidleft.setOnClickListener {
            nilaia +=2
            binding.tvHasil1.text= nilaia.toString()
        }
        binding.bMidright.setOnClickListener {
            nilaib +=2
            binding.tvHasil2.text= nilaib.toString()
        }
        binding.bBottomleft.setOnClickListener {
            nilaia +=1
            binding.tvHasil1.text= nilaia.toString()
        }
        binding.bBottomrigth.setOnClickListener {
            nilaib +=1
            binding.tvHasil2.text= nilaib.toString()
        }


        binding.bReset.setOnClickListener {
            nilaia=0
            nilaib=0
            tv_hasil1.text= nilaia.toString()
            tv_hasil2.text= nilaib.toString()
        }

    }
}
