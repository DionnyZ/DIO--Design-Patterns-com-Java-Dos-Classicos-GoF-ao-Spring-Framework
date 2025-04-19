fetch('https://api.thedogapi.com/v1/images/search?limit=5&has_breeds=true') // Busca 5 imagens com informações de raças
    .then(response => response.json())
    .then(data => {
        const container = document.getElementById('dog-container');
        container.innerHTML = ''; // Limpa o container

        data.forEach(item => {
            const breedName = item.breeds && item.breeds[0] ? item.breeds[0].name : 'Raça desconhecida'; // Verifica se a raça existe
            const imgUrl = item.url; // URL da imagem

            const div = document.createElement('div');
            div.className = 'dog-item';
            div.innerHTML = `
                <strong>Nome:</strong> ${breedName} <br>
                <img src="${imgUrl}" alt="${breedName}" style="width:200px; border:1px solid #ccc; border-radius:5px;">
            `;
            container.appendChild(div);
        });
    })
    .catch(error => {
        console.error('Erro ao buscar dados:', error);
    });
