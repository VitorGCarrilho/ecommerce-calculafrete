# ecommerce-calculafrete
O mercado de TI está em constante evolução. O avanço da tecnologia nos torna cada vez mais conectados, e o segmento corporativo demanda de softwares com integridade de dados, seguros e de alta performance.
Para atender essas demandas, mediante ao avanço da tecnologia, e os prazos curtos, é preciso que os programadores atinjam um nível elevado de produtividade. Portanto a utilização de Frameworks e APIs é cada vez mais comum nas grandes corporações.
Entre os principais benefícios que a utilização APIs nos proporcionam, estão a eficácia e agilidade que nos permite atingir níveis elevados de produtividade fazendo com que o programador se concentre apenas nos requisitos principais da aplicação, abstraindo a implementação e reduzindo sua carga cognitiva.
Como exemplo, pode-se citar um E-Commerce, onde a etapa de finalização do pedido, exibe o valor do frete a partir do CEP informado. É totalmente inviável que a própria aplicação faça este cálculo. 
Em um cenário onde a própria aplicação cuida dos cálculos do frete, seria necessário simular todo cálculo realizado pelo Correio, levando em conta diversas variáveis, tais como: cidade de origem, cidade de destino, peso do pacote entre outras variáveis. 
Seria necessário uma base de dados com todos os CEPs do país se relacionando com cidades e ruas que acabaria ocupando um grande volume de dados em disco, que faria com que a performance da aplicação oscile.

“Uma das otimizações mais básicas é tentar manter seus dados (e índices) utilizando o menor espaço possível no disco (e em memória). Isto pode fornecer grandes melhorias porque a leitura de disco é mais rápida e normalmente menos memória principal será usada”. (Documentação mysql). 

Outro problema que se encontra nesse cenário é a integridade dos dados, que precisam estar sempre atualizados para garantir a sua integridade e dos cálculos. 
Para que o desenvolvimento seja feito sem essas variáveis externas, pode-se utilizar as APIs. O correios já disponibilizam uma API que pode ser consumida por um wsdl passando como parâmetros essas variáveis
