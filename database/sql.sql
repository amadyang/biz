

create table VP_CUSTOMER_NEW
(
  SEQ			   int(12) NOT NULL auto_increment,
  A_DEPT           varchar(64),
  A_FILLER         varchar(10),
  A_FILLDATE       DATE,
  A_BANKTYPE       varchar(20),
  A_CUSTID         varchar(10),
  A_CUSTNAME       varchar(64),
  A_CUSTADD        varchar(128),
  A_PHONENUM       varchar(64),
  A_CONTACT        varchar(64),
  A_BELONGTONAME   varchar(128),
  A_CONTRACTNO     varchar(32),

  A_BEGINDATE      DATE,
  A_CUSTNEWOLD     varchar(20),
  C_PAYSELFRATIO   FLOAT,
  C_PAYSELFPRICE   FLOAT,
  C_PAYSELFNUM     varchar(10),
  C_PAYSELFCUST    varchar(64),
  C_PAYSELFTYPE    varchar(10),
  C_PAYMETHOD      varchar(10),
  C_PAYOTHERRATIO  FLOAT,
  C_PAYOTHERPRICE  FLOAT,
  C_PAYOTHERNUM    varchar(10),
  C_PAYOTHERCUST   varchar(64),
  C_PAYOTHERTYPE   varchar(10),
  C_PAYOTHERMETHOD varchar(10),
  C_PAYSELFFREQ    varchar(20),
  C_PAYOTHERFREQ   varchar(20),
  D_RESULT         varchar(20),
  Z_MKTDEALER      varchar(20),
  Z_BRANCHDEALS    varchar(64),
  Z_ZHUREN         varchar(10),
  PRIMARY KEY  (SEQ) 
);