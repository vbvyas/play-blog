# Articles schema

# --- !Ups

CREATE SEQUENCE article_id_seq;
CREATE TABLE article (
	id integer NOT NULL DEFAULT nextval('article_id_seq'),
	title varchar(255),
	author varchar(100),
	content varchar(1000)
);

# --- !Downs

DROP TABLE article;
DROP SEQUENCE article_id_seq;