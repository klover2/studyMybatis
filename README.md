# studyMybatis
练习mybatis3

中文文档 https://mybatis.org/mybatis-3/zh/index.html

## 数据库结果和测试数据
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "public"."user";
CREATE TABLE "public"."user" (
"id" int4 NOT NULL,
"name" varchar(255) COLLATE "pg_catalog"."default",
"age" int4,
"time" date
)
;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO "public"."user" VALUES (1, '123123', 10, '2021-11-30');

-- ----------------------------
-- Primary Key structure for table user
-- ----------------------------
ALTER TABLE "public"."user" ADD CONSTRAINT "user_pkey" PRIMARY KEY ("id");


-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS "public"."goods";
CREATE TABLE "public"."goods" (
"id" int4 NOT NULL,
"name" varchar(255) COLLATE "pg_catalog"."default",
"amount" numeric(255,0),
"userId" int4
)
;
COMMENT ON COLUMN "public"."goods"."name" IS '商品名称';
COMMENT ON COLUMN "public"."goods"."amount" IS '商品价格';
COMMENT ON COLUMN "public"."goods"."userId" IS '用户id';

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO "public"."goods" VALUES (1, 'test1', 10, 1);
INSERT INTO "public"."goods" VALUES (2, '特殊t', 10, 1);

-- ----------------------------
-- Primary Key structure for table goods
-- ----------------------------
ALTER TABLE "public"."goods" ADD CONSTRAINT "goods_pkey" PRIMARY KEY ("id");
