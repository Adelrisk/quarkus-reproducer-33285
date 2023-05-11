
create table document (
	id UUID NOT NULL,
	filename varchar,
	location varchar,
	extension varchar,
	mimetype varchar,
	"hash" varchar,
	created_at TIMESTAMP,
	last_modified TIMESTAMP,
	PRIMARY KEY (id)
);