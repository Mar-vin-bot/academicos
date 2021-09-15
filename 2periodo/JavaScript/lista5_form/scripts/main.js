
function mostrarEntrar(){
    user = document.getElementById("login").value
    s = document.getElementById("senha").value
    conf = document.getElementById("confSenha").value

    if (user ==""){
        alert("Digite sua credencial de email.")
        document.getElementById("login").focus();
     }else if (s == "" || conf == ""){
        alert("Campo obrigatorio vazio, favor digite sua senha e confirme.")
        document.getElementById("senha").focus();
    }else if (s !== conf){
        alert("Autorização negada.")
        document.getElementById("senha").focus();
    }else{
        alert("Credencias autorizadas.")
    }
}

