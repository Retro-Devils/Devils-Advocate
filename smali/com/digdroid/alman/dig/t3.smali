.class Lcom/digdroid/alman/dig/t3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Lcom/digdroid/alman/dig/s3;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Ljava/lang/String;

.field n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field p:Ljava/lang/String;

.field q:Ljava/lang/String;

.field r:Ljava/lang/String;

.field s:Ljava/lang/String;

.field t:Ljava/lang/String;

.field u:Ljava/lang/String;

.field v:Ljava/lang/String;

.field w:Ljava/lang/String;

.field x:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/digdroid/alman/dig/c4;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/digdroid/alman/dig/s3;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/s3;-><init>(Lcom/digdroid/alman/dig/c4;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/s3;->P(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    const-string p2, "themes/black.cfg"

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/s3;->j(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    const-string p2, "default"

    invoke-virtual {p1, p2, p0}, Lcom/digdroid/alman/dig/s3;->M(Ljava/lang/String;Lcom/digdroid/alman/dig/t3;)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/t3;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const v0, 0x7f12000b

    goto :goto_0

    :cond_0
    const v0, 0x7f12000c

    :goto_0
    return v0
.end method

.method b()I
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/t3;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget-boolean v0, Lcom/digdroid/alman/dig/q3;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const v1, -0xbbbbbc

    :goto_0
    return v1
.end method

.method c()I
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/t3;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget-boolean v0, Lcom/digdroid/alman/dig/q3;->c:Z

    if-nez v0, :cond_0

    const v0, -0x111112

    goto :goto_0

    :cond_0
    const v0, -0x888889

    :goto_0
    return v0
.end method

.method d()I
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/t3;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget-boolean v0, Lcom/digdroid/alman/dig/q3;->c:Z

    if-nez v0, :cond_0

    const v1, -0xcccccd

    :cond_0
    return v1
.end method

.method e()I
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/t3;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget-boolean v0, Lcom/digdroid/alman/dig/q3;->c:Z

    if-nez v0, :cond_0

    const v0, 0x7f120003

    goto :goto_0

    :cond_0
    const v0, 0x7f120002

    :goto_0
    return v0
.end method

.method f()I
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/t3;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const v0, 0x7f0700a8

    goto :goto_0

    :cond_0
    const v0, 0x7f0700a6

    :goto_0
    return v0
.end method
