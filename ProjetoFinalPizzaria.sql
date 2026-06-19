USE pizzaria;

CREATE TABLE menu (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sabor VARCHAR(100) NOT NULL
);

CREATE TABLE acompanhamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL,
    valor DOUBLE NOT NULL
);

CREATE TABLE tamanho (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tamanho VARCHAR(50) NOT NULL,
    valor DOUBLE NOT NULL
);

CREATE TABLE preco (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_sabor INT NOT NULL,
    id_tamanho INT NOT NULL,
    id_acompanhamento INT,
    FOREIGN KEY (id_sabor) REFERENCES menu (id),
    FOREIGN KEY (id_tamanho) REFERENCES tamanho (id),
    FOREIGN KEY (id_acompanhamento) REFERENCES acompanhamento (id)
);

CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
    metodo_pagamento VARCHAR(50) NOT NULL,
    id_preco INT NOT NULL,
    FOREIGN KEY (id_preco) REFERENCES preco (id)
    data_pedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
);
