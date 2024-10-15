//DOM (Document Object Model) 
document

.addEventListener('DOMContentLoaded',
    async function() {
        try{
            const response = await fetch('https://5682-177-91-39-198.ngrok-free.app/api/user',
                {
                    method: 'GET',
                    headers: {
                        'ngrok-skip-browser-warning': 'true'
                    }
                }
            );
            if(!response.ok){
                throw new Error('Algo de errado não esta certo, '+ response.status);
            }

            const data = await response.json();
            
            console.log(data);

            document.getElementById('name').textContent = data.name;
            document.getElementById('age').textContent = data.age;
            document.getElementById('aboutme').textContent = data.aboutme;


        } catch(error ){
            console.log('Erro:', error);
        }
    } 

    
)