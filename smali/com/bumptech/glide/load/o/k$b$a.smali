.class Lcom/bumptech/glide/load/o/k$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/t/l/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/o/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/t/l/a$d<",
        "Lcom/bumptech/glide/load/o/l<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bumptech/glide/load/o/k$b;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/o/k$b;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/load/o/k$b$a;->a:Lcom/bumptech/glide/load/o/k$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/load/o/k$b$a;->b()Lcom/bumptech/glide/load/o/l;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/bumptech/glide/load/o/l;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/o/l<",
            "*>;"
        }
    .end annotation

    new-instance v8, Lcom/bumptech/glide/load/o/l;

    iget-object v0, p0, Lcom/bumptech/glide/load/o/k$b$a;->a:Lcom/bumptech/glide/load/o/k$b;

    iget-object v1, v0, Lcom/bumptech/glide/load/o/k$b;->a:Lcom/bumptech/glide/load/o/c0/a;

    iget-object v2, v0, Lcom/bumptech/glide/load/o/k$b;->b:Lcom/bumptech/glide/load/o/c0/a;

    iget-object v3, v0, Lcom/bumptech/glide/load/o/k$b;->c:Lcom/bumptech/glide/load/o/c0/a;

    iget-object v4, v0, Lcom/bumptech/glide/load/o/k$b;->d:Lcom/bumptech/glide/load/o/c0/a;

    iget-object v5, v0, Lcom/bumptech/glide/load/o/k$b;->e:Lcom/bumptech/glide/load/o/m;

    iget-object v6, v0, Lcom/bumptech/glide/load/o/k$b;->f:Lcom/bumptech/glide/load/o/p$a;

    iget-object v7, v0, Lcom/bumptech/glide/load/o/k$b;->g:Lb/g/j/f;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/bumptech/glide/load/o/l;-><init>(Lcom/bumptech/glide/load/o/c0/a;Lcom/bumptech/glide/load/o/c0/a;Lcom/bumptech/glide/load/o/c0/a;Lcom/bumptech/glide/load/o/c0/a;Lcom/bumptech/glide/load/o/m;Lcom/bumptech/glide/load/o/p$a;Lb/g/j/f;)V

    return-object v8
.end method
