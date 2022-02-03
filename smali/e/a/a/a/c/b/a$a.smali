.class final Le/a/a/a/c/b/a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/a/a/a/c/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field final a:[Z

.field final b:[B

.field final c:[B

.field final d:[B

.field final e:[I

.field final f:[[I

.field final g:[[I

.field final h:[[I

.field final i:[I

.field final j:[I

.field final k:[C

.field final l:[[C

.field final m:[B

.field n:[I

.field o:[B


# direct methods
.method constructor <init>(I)V
    .locals 4

    const-class v0, I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x100

    new-array v2, v1, [Z

    iput-object v2, p0, Le/a/a/a/c/b/a$a;->a:[Z

    new-array v2, v1, [B

    iput-object v2, p0, Le/a/a/a/c/b/a$a;->b:[B

    const/16 v2, 0x4652

    new-array v3, v2, [B

    iput-object v3, p0, Le/a/a/a/c/b/a$a;->c:[B

    new-array v2, v2, [B

    iput-object v2, p0, Le/a/a/a/c/b/a$a;->d:[B

    new-array v2, v1, [I

    iput-object v2, p0, Le/a/a/a/c/b/a$a;->e:[I

    const/4 v2, 0x2

    new-array v3, v2, [I

    fill-array-data v3, :array_0

    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[I

    iput-object v3, p0, Le/a/a/a/c/b/a$a;->f:[[I

    new-array v3, v2, [I

    fill-array-data v3, :array_1

    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[I

    iput-object v3, p0, Le/a/a/a/c/b/a$a;->g:[[I

    new-array v3, v2, [I

    fill-array-data v3, :array_2

    invoke-static {v0, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Le/a/a/a/c/b/a$a;->h:[[I

    const/4 v0, 0x6

    new-array v3, v0, [I

    iput-object v3, p0, Le/a/a/a/c/b/a$a;->i:[I

    const/16 v3, 0x101

    new-array v3, v3, [I

    iput-object v3, p0, Le/a/a/a/c/b/a$a;->j:[I

    new-array v1, v1, [C

    iput-object v1, p0, Le/a/a/a/c/b/a$a;->k:[C

    new-array v1, v2, [I

    fill-array-data v1, :array_3

    const-class v2, C

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[C

    iput-object v1, p0, Le/a/a/a/c/b/a$a;->l:[[C

    new-array v0, v0, [B

    iput-object v0, p0, Le/a/a/a/c/b/a$a;->m:[B

    const v0, 0x186a0

    mul-int p1, p1, v0

    new-array p1, p1, [B

    iput-object p1, p0, Le/a/a/a/c/b/a$a;->o:[B

    return-void

    nop

    :array_0
    .array-data 4
        0x6
        0x102
    .end array-data

    :array_1
    .array-data 4
        0x6
        0x102
    .end array-data

    :array_2
    .array-data 4
        0x6
        0x102
    .end array-data

    :array_3
    .array-data 4
        0x6
        0x102
    .end array-data
.end method


# virtual methods
.method a(I)[I
    .locals 2

    iget-object v0, p0, Le/a/a/a/c/b/a$a;->n:[I

    if-eqz v0, :cond_0

    array-length v1, v0

    if-ge v1, p1, :cond_1

    :cond_0
    new-array v0, p1, [I

    iput-object v0, p0, Le/a/a/a/c/b/a$a;->n:[I

    :cond_1
    return-object v0
.end method
