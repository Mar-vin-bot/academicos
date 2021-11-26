function validar() {
    userNome = document.getElementById("txtNome").value;
    userRa = document.getElementById("txtRa").value;
    userN1 = document.getElementById("txt1b").value;
    userN2 = document.getElementById("txt2b").value;

    userSoma = parseFloat(userN1) + parseFloat(userN2);



    if (userSoma >= 60) {
        userSit = "Aprovado"
    } else if (userSoma < 60) {
        userSit = "Reprovado"
    }



    if (userNome == "" || userRa == "" || userN1 == "" || userN2 == "") {
        alert("Favor preencha todos os campos!")
    } else if (userN1 > 50 || userN2 > 50) {
        alert("Preencha uma nota valida entre 0 e 50")
    } else {

        usrAluno = { nome: userNome, ra: userRa, nota1: userN1, nota2: userN2, total: userSoma, situacao: userSit }  //objeto



        tabUsuarios = JSON.parse(localStorage.getItem("tabUsuarios"))

        if (tabUsuarios == null) tabUsuarios = { usuarios: [] };
        //se não existir tabUsuarios esta sera criada nesta linha


        tabUsuarios.usuarios.push(usrAluno)
        //push() para adcionar novos usuarios ao vetor

        localStorage.setItem("tabUsuarios", JSON.stringify(tabUsuarios));

        alert("Aluno cadastrado!")

    }
}

function mostrar() {
    tabUsuarios = JSON.parse(localStorage.getItem("tabUsuarios"));
    if (!tabUsuarios) {         //not tabUsuarios. Se a table ainda não foi criada
        document.write("Não existe alunos cadastrados")
    } else {

        document.write(`<table style="text-align:center">`);
        document.write(" <th>Nome</th>   <th>RA</th>    <th>1º bimestre</th>    <th>2º bimestre</th>    <th>Total</th>  <th>Situação</th>")
        


        for (i = 0; i < tabUsuarios.usuarios.length; i++)

             document.write(`<tr>    
                <td>${tabUsuarios.usuarios[i].nome}</td>   
                   <td>${tabUsuarios.usuarios[i].ra}</td> 
                   <td>${tabUsuarios.usuarios[i].nota1}</td>
                    <td>${tabUsuarios.usuarios[i].nota2}</td>
                    <td> ${tabUsuarios.usuarios[i].total} </td> 
                     <td>${tabUsuarios.usuarios[i].situacao}  </td>
                      </tr>`)
        
                      


        document.write(`</table>`)


    }
}