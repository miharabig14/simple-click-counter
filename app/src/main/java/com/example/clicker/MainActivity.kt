package com.example.clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var switch: Switch
    private lateinit var switch2: Switch
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch = findViewById(R.id.switch1)
        switch2 = findViewById(R.id.switch2)
        button = findViewById(R.id.button2)
        onBtnClick()
        onSwitchChecked()
    }
    fun onSwitchChecked() {
        switch.setOnCheckedChangeListener { _, isChecked ->
            switch2.isChecked = !isChecked
        }
        switch2.setOnCheckedChangeListener { _, isChecked ->
            switch.isChecked = !isChecked
        }
    }
    fun onBtnClick() {
        button.setOnClickListener {
            if(switch.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Я не сомневался в тебе!",
                    Toast.LENGTH_SHORT
                )
            }
            else if(switch2.isChecked) {
                Toast.makeText(
                    applicationContext,
                    "Тебе стоит задуматься над своим времяпровождением!",
                    Toast.LENGTH_SHORT
                )
            }
            else {
                Toast.makeText(
                    applicationContext,
                    "j̴̵̵͚͔͎̻̱̖̪̤͊͒ͦ̊̋̇͑͂̀̀̕͞͠n̸̸̷̸̡̺̼̠̹͉̰̠͈͒̌͆̋ͪ̍͆̓̀̕͠ḑ̵̵̶̛ͥ̊̅̂̀̏̑ͦ́͏̪̱̼̟̰͈͔̖̕f̴̶̧̡̒ͯͫͥͦͥ̊ͦ͟͞͞҉̠̹̪͕͔͓͚̣s̢̢̧̛̻̫͉̫̥͇̣͎ͣ̒ͣ̅̄͗ͩ̚̕͢͟͜ĵ̷̢́ͩ̆ͪ̃̈́̀̚̕͟͠҉̨̟̩̩͍͎̜̻͙k̷̷̷̤͓̙̲̫͍̯̜͐̀͋̌͒ͯ̎̓̀́͘͟͝f̸̵̨̡̧̧͙̰͚͍̞͔͎͓̌͗̃̾̽̉̎́͜͝j̸̶̷̺͓̣̙͔̫͈͆̽̂͆̒ͫ̈́̏́͘̕͟͝ͅk̢̂͐͛͂͆͌́ͣ͘͜҉̴̵̴̡͓͓̼̘̭̹͉̠f͊̊ͧ̇̓ͬͫ̅̀͏̷̧͜͠͞͏̫̹̝͎͖̯͚̻ḑ̷̵̛ͭ͐̈́́͆ͨ͆̌͡͡͏̵͈̮̦͙͇̼̺ͅj̧̼̰̼̯̟̞͇͕̏͗́͑͛̒ͧͪ́̀́̀̕͝͠kͧͣ̔̈̿͗ͪ̚͝҉̶̛͍̖̰̥̲̱̗̟́̕̕͝s̨̍ͮͪ̾̈́ͩ̓̎̀҉̵̨̛̫̻͉̬̻͙̬́͘ͅf̶̶̨̧̬̞̬͔̹̝̫̬̑͐ͬ̑ͯ̇͗ͨ͢͢͡͠j̶̧̛̖͍̮͇͕͚̘̗͋ͬ͛̀ͥ̾ͭͯ́́͢͝͠k̷̴̟͖̠̜̗͚̺͓ͣͪ̽̐͌ͯ̒ͣ̀̀̕͢͢͟d̷̷̶̢̧̛̝͉̺̱̺̦̙ͬͥ̎̽ͭ̇̅͛͘̕ͅn̵̴̡̧̛̜̼̺̣̲͈͔̘ͥͭ̓̐͂̂̀̓́͞͞s̡̢̊̑̆̓̌ͮ͌̚̕͠͝͏҉̷͖̤̻͚̮̝̦͇f̧ͯ͆̇ͧ̔ͦ͌͋҉͜͢͡͠҉̶̣͓̼̹̤̖̪̱ķ̴̵̸̨̛̠͚͉̠͇̟͎͚ͩ̀ͦ̓͛ͯ̿́̚͝j̷̴̡̢̛̻̞͓̗̻̘̼̙͂͂̋ͯͦ̔̂̓́͘͝l̐̈̀̂̉̏̒͛̕͢͏̵̷̧̨̜̫͚̘̝͖͚̀ͅn̸̸̡̬̻̣͓̥̗̮͚̎ͤ̀͛͛̌̀́́̚̚͘͢k̷̶̙̜̜̳̤̜̥̣ͫͫͩͬ͗ͬͤ̏͘͜͜͝͝͡j̶̶̶̸̡̡̢̠̭̗̯͔̬̝͖̓ͦ͗͋͗̒̐̍͟ļ̴̢̡̳̟̜̺̱̘̥̘̈́̉̄̆̈ͦͪ̈̀͘͜͠n̵̨̛̓̄́́̆̊ͨ̿͞͡͏̶̳̻͎͇̘̩̹̹͠â̷̵͛̂ͥ͂ͥͤͨ͏̸̛̀҉͏̮̖̦̣̟͇̦ͅf̷̣͓̻̬̫̞̬͉̐̾ͭͤͦ̑ͧ͊̀͘͘͟͝͝͞d̶̷̃͊͐͌ͫͯ͊̚҉̷̢̧̯̘͉̹̟͖̱̯͢͞sͯͩ̆̽̓ͧͦ͂҉̵̨̧̥͓̱̞̝̮̣̱̀̀́͟",
                    Toast.LENGTH_SHORT
                )
            }
        }
    }
}