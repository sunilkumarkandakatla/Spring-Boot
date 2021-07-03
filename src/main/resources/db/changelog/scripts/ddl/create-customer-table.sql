CREATE TABLE Customer(
	customer_id bigint NOT NULL DEFAULT nextval(('"customer_id_seq"'::text)::regclass),
	customer_name varchar(60) NOT NULL,
	customer_desc varchar(120),
	created_timestamp timestamp NOT NULL,
	updated_timestamp timestamp NOT NULL
);

CREATE SEQUENCE "customer_id_seq" INCREMENT 1 START 1;

ALTER TABLE Customer ADD CONSTRAINT "PK_Customer" PRIMARY KEY (customer_id);