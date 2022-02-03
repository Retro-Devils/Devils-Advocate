.class public Ld/a/a/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)D
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x1

    invoke-static {p0, p1, v1}, Ld/a/a/a;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    sub-int p0, v0, p0

    int-to-double p0, p0

    int-to-double v0, v0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 21

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-lez v2, :cond_0

    if-lez v3, :cond_0

    aget-char v7, v0, v5

    aget-char v8, v1, v6

    if-ne v7, v8, :cond_0

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    const/4 v7, 0x1

    if-lez v2, :cond_1

    if-lez v3, :cond_1

    add-int v8, v5, v2

    sub-int/2addr v8, v7

    aget-char v8, v0, v8

    add-int v9, v6, v3

    sub-int/2addr v9, v7

    aget-char v9, v1, v9

    if-ne v8, v9, :cond_1

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    return v3

    :cond_2
    if-nez v3, :cond_3

    return v2

    :cond_3
    if-le v2, v3, :cond_4

    move/from16 v19, v3

    move v3, v2

    move/from16 v2, v19

    goto :goto_2

    :cond_4
    move-object/from16 v19, v1

    move-object v1, v0

    move-object/from16 v0, v19

    move/from16 v20, v6

    move v6, v5

    move/from16 v5, v20

    :goto_2
    if-ne v2, v7, :cond_6

    if-eqz p2, :cond_5

    add-int/lit8 v2, v3, 0x1

    aget-char v1, v1, v6

    invoke-static {v0, v5, v1, v3}, Ld/a/a/a;->c([CICI)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    sub-int/2addr v2, v0

    return v2

    :cond_5
    aget-char v1, v1, v6

    invoke-static {v0, v5, v1, v3}, Ld/a/a/a;->c([CICI)I

    move-result v0

    sub-int/2addr v3, v0

    return v3

    :cond_6
    add-int/2addr v2, v7

    add-int/2addr v3, v7

    shr-int/lit8 v8, v2, 0x1

    new-array v9, v3, [I

    add-int/lit8 v10, v3, -0x1

    const/4 v11, 0x0

    :goto_3
    if-eqz p2, :cond_7

    const/4 v12, 0x0

    goto :goto_4

    :cond_7
    move v12, v8

    :goto_4
    sub-int v12, v3, v12

    if-ge v11, v12, :cond_8

    aput v11, v9, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_8
    if-eqz p2, :cond_c

    const/4 v3, 0x1

    :goto_5
    if-ge v3, v2, :cond_18

    add-int v4, v6, v3

    sub-int/2addr v4, v7

    aget-char v4, v1, v4

    move v12, v3

    move v13, v12

    move v11, v5

    const/4 v8, 0x1

    :goto_6
    if-gt v8, v10, :cond_b

    add-int/lit8 v14, v11, 0x1

    aget-char v11, v0, v11

    if-ne v4, v11, :cond_9

    add-int/lit8 v13, v13, -0x1

    goto :goto_7

    :cond_9
    add-int/lit8 v13, v12, 0x1

    :goto_7
    aget v11, v9, v8

    add-int/2addr v11, v7

    if-le v13, v11, :cond_a

    move v12, v11

    goto :goto_8

    :cond_a
    move v12, v13

    :goto_8
    add-int/lit8 v13, v8, 0x1

    aput v12, v9, v8

    move v8, v13

    move v13, v11

    move v11, v14

    goto :goto_6

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    sub-int v11, v2, v8

    add-int/lit8 v12, v11, -0x1

    aput v12, v9, v4

    const/4 v12, 0x1

    :goto_9
    if-ge v12, v2, :cond_18

    add-int v13, v6, v12

    sub-int/2addr v13, v7

    aget-char v13, v1, v13

    if-lt v12, v11, :cond_f

    sub-int v14, v12, v11

    add-int v15, v5, v14

    add-int/lit8 v16, v14, 0x1

    aget v14, v9, v14

    add-int/lit8 v17, v15, 0x1

    aget-char v15, v0, v15

    if-eq v13, v15, :cond_d

    const/4 v15, 0x1

    goto :goto_a

    :cond_d
    const/4 v15, 0x0

    :goto_a
    add-int/2addr v14, v15

    aget v15, v9, v16

    add-int/2addr v15, v7

    if-le v15, v14, :cond_e

    goto :goto_b

    :cond_e
    move v14, v15

    :goto_b
    add-int/lit8 v18, v16, 0x1

    aput v14, v9, v16

    goto :goto_c

    :cond_f
    move/from16 v17, v5

    move v14, v12

    move v15, v14

    const/16 v18, 0x1

    :goto_c
    add-int/lit8 v4, v8, 0x1

    if-gt v12, v4, :cond_10

    add-int v4, v3, v12

    sub-int/2addr v4, v8

    add-int/lit8 v4, v4, -0x2

    move v10, v4

    :cond_10
    move/from16 v4, v18

    :goto_d
    if-gt v4, v10, :cond_14

    add-int/lit8 v15, v15, -0x1

    add-int/lit8 v16, v17, 0x1

    aget-char v7, v0, v17

    if-eq v13, v7, :cond_11

    const/4 v7, 0x1

    goto :goto_e

    :cond_11
    const/4 v7, 0x0

    :goto_e
    add-int/2addr v15, v7

    add-int/lit8 v14, v14, 0x1

    if-le v14, v15, :cond_12

    goto :goto_f

    :cond_12
    move v15, v14

    :goto_f
    aget v7, v9, v4

    const/16 v18, 0x1

    add-int/lit8 v7, v7, 0x1

    if-le v15, v7, :cond_13

    move v14, v7

    goto :goto_10

    :cond_13
    move v14, v15

    :goto_10
    add-int/lit8 v15, v4, 0x1

    aput v14, v9, v4

    move v4, v15

    move/from16 v17, v16

    move v15, v7

    const/4 v7, 0x1

    goto :goto_d

    :cond_14
    const/16 v18, 0x1

    if-gt v12, v8, :cond_17

    add-int/lit8 v15, v15, -0x1

    aget-char v7, v0, v17

    if-eq v13, v7, :cond_15

    const/4 v7, 0x1

    goto :goto_11

    :cond_15
    const/4 v7, 0x0

    :goto_11
    add-int/2addr v15, v7

    add-int/lit8 v14, v14, 0x1

    if-le v14, v15, :cond_16

    goto :goto_12

    :cond_16
    move v15, v14

    :goto_12
    aput v15, v9, v4

    :cond_17
    add-int/lit8 v12, v12, 0x1

    const/4 v4, 0x0

    const/4 v7, 0x1

    goto :goto_9

    :cond_18
    aget v0, v9, v10

    return v0
.end method

.method private static c([CICI)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    const/4 v1, 0x0

    :cond_0
    add-int v2, p1, v1

    aget-char v2, p0, v2

    if-ne v2, p2, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p3, p3, -0x1

    if-nez p3, :cond_0

    :cond_2
    return v0
.end method
