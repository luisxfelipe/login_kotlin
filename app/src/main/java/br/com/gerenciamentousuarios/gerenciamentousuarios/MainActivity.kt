package br.com.gerenciamentousuarios.gerenciamentousuarios

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.security.Principal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_cadastro.setOnClickListener {
            startActivity<Cadastro>()
        }

        btn_login.setOnClickListener {

            if (txt_usuario_login.text.toString() == "Admin" && txt_senha_login.text.toString() == "1234"){
                startActivity<PrincipalActivity>()
            }else{
                toast("Usuário ou senha incorreto!")
            }
        }


    }
}
