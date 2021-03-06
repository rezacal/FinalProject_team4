DROP SEQUENCE MAPNOSEQ;
DROP TABLE MAP PURGE;

CREATE SEQUENCE MAPNOSEQ;

CREATE TABLE MAP (
	MAPNO NUMBER PRIMARY KEY,
	LATITUDE NUMBER NOT NULL,
	LONGITUDE NUMBER NOT NULL,
	ADDR VARCHAR2(500) NOT NULL,
	JIBUN VARCHAR2(500) NOT NULL
);

INSERT into MAP
VALUES (MAPNOSEQ.NEXTVAL, 37.546727, 127.095503, '서울특별시 강남구 테헤란로14길 6', '역삼동 823-25');

SELECT * FROM MAP ORDER BY MAPNO;