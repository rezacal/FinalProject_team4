DROP SEQUENCE BOOKMARK_NO_SEQ;
CREATE SEQUENCE BOOKMARK_NO_SEQ;
CREATE TABLE BOOKMARK (

    BOOKMARK_NO INT
    ,PAGE_NO INT
    ,BOOKMARK_NAME VARCHAR2(20) NOT NULL
    ,BOOKMARK_SCROLLTOP INT NOT NULL
    ,CONSTRAINT BOOKMARK_PK PRIMARY KEY(BOOKMARK_NO)
    ,CONSTRAINT BOOKMARK_PAGE_NO_FK FOREIGN KEY(PAGE_NO) REFERENCES PAGES(PAGE_NO));
)