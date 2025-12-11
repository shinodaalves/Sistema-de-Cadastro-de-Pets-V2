function enviar() {

    const pet = {
        nome: document.getElementById("nome").value,
        tipo: document.getElementById("tipo").value,
        sexo: document.getElementById("sexo").value,
        endereco: document.getElementById("endereco").value,
        idade: parseInt(document.getElementById("idade").value),
        peso: parseInt(document.getElementById("peso").value),
        raca: document.getElementById("raca").value
    };

    if (!pet.nome || !pet.tipo || !pet.sexo) {
        alert("Preencha pelo menos: Nome, Tipo e Sexo!");
        return;
    }

    fetch("http://localhost:8080/pet", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(pet)
    })
    .then(res => {
        if (!res.ok) {
            throw new Error("Erro ao salvar");
        }
        return res.json();
    })
    .then(data => {
        alert("Pet cadastrado com sucesso!\nID gerado: " + data.id);
        console.log(data);
    })
    .catch(err => {
        alert("Falha ao enviar dados.");
        console.error(err);
    });
}