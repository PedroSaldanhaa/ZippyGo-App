

<br>
<p align="center">
<img src="https://raw.githubusercontent.com/PedroSaldanhaa/ZippyGo-App/refs/heads/main/Logo-ZippyGo.png" alt="Banner do projeto LetsSign" width="500">
</p>
<br>


## ZippyGO: Solução Inovadora para Delivery Sustentável

O ZippyGO é um protótipo de aplicativo multiplataforma que se destaca por sua abordagem inovadora e sustentável para o mercado de delivery. A solução oferece uma experiência de compra ágil e ambientalmente responsável, utilizando uma frota de veículos elétricos. O grande diferencial é a prioridade em entregas via drones, complementadas por motos, bicicletas e carros elétricos para garantir versatilidade para encomendas de maiores dimensões, peso, ou para atender localidades onde a operação de drones não é viável.

# Status do Projeto (Sprint 1 / Front-End)

A versão atualmente no repositório corresponde à Sprint 1 de Front-End, cujo foco principal foi o teste e a validação do fluxo de telas e a integração inicial da API do Mapbox para a funcionalidade de rastreamento.

É importante notar que, nesta fase, a prioridade foi a funcionalidade e a navegação entre as telas. Portanto, o layout atual, embora funcional, não representa com 100% de similaridade o protótipo final de design. Ajustes finos de alinhamento e enquadramento foram intencionalmente ignorados para agilizar a implementação do fluxo principal.

Funcionalidades Implementadas (Protótipo Android)

O escopo atual do protótipo cobre o fluxo de usuário, desde a autenticação até o acompanhamento do pedido. As funcionalidades incluem: Telas de Autenticação e Onboarding; Menu Principal e Descoberta de estabelecimentos; Jornada de Compra com navegação por cardápios e carrinho de compras; Checkout com seleção de formato de entrega (drone, moto ou carro elétrico); e Acompanhamento em Tempo Real com status do pedido e mapa interativo via API do Mapbox.

# Tecnologias Utilizadas (MVP Android)

Plataforma: Android 

Linguagem: Kotlin e Java 

Interface (UI): Jetpack Compose e XML 

APIs: REST (HTTPS) e Mapbox API 

Próximas Implementações

# Roadmap de desenvolvimento :

Sprint 2 / Front-End: Incluirá o ajuste fino da UI para assemelhação com os protótipos de design (Figma); a calibração da API de GPS para melhor precisão; a implementação das APIs de login social (Google, Facebook, Apple); e a atribuição de funções a todos os botões e elementos interativos.

Sprint 1 / Back-End: Dará início ao desenvolvimento do back-end utilizando Java, seguido pela implementação das tecnologias de banco de dados e demais integrações.

# Como Executar o Projeto
Clone o repositório para sua máquina local usando o comando:

git clone https://github.com/PedroSaldanhaa/ZippyGo-App

Abra a pasta do projeto no Android Studio.

Na raiz do projeto, crie um novo arquivo chamado secrets.properties.

Dentro de secrets.properties, adicione sua chave da Mapbox no seguinte formato:

MAPBOX_API_KEY= SUA CHAVE AQUI 

Sincronize o projeto com os arquivos Gradle e execute.
