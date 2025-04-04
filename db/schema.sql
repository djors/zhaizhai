CREATE TABLE comics (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    original_title VARCHAR(255),
    info VARCHAR(255),
    rating DECIMAL(3, 1),
    year YEAR,
    intro TEXT,
    poster_image_id BIGINT,
    FOREIGN KEY (poster_image_id) REFERENCES images(id)
);

CREATE TABLE characters (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    role VARCHAR(255),
    character_image_id BIGINT UNSIGEND,
    FOREIGN KEY (character_image_id) REFERENCES images(id)
);

CREATE TABLE comic_characters (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    comic_id BIGINT,
    character_id BIGINT,
    KEY (comic_id, character_id),
    FOREIGN KEY (comic_id) REFERENCES comics(id),
    FOREIGN KEY (character_id) REFERENCES characters(id)
);

CREATE TABLE comic_attributes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    comic_id BIGINT,
    attribute_key VARCHAR(255),
    attribute_value VARCHAR(255),
    FOREIGN KEY (comic_id) REFERENCES comics(id)
);

CREATE TABLE images (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    path VARCHAR(255) NOT NULL,
    url VARCHAR(255) NOT NULL,
    type ENUM('poster', 'character') NOT NULL,
    local_path VARCHAR(255) NULL COMMENT '本地路径'
);