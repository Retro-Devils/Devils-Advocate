.class public Lcom/bumptech/glide/load/p/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/load/p/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/p/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/p/o<",
        "[B",
        "Ljava/nio/ByteBuffer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/bumptech/glide/load/p/r;)Lcom/bumptech/glide/load/p/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/p/r;",
            ")",
            "Lcom/bumptech/glide/load/p/n<",
            "[B",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/bumptech/glide/load/p/b;

    new-instance v0, Lcom/bumptech/glide/load/p/b$a$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/p/b$a$a;-><init>(Lcom/bumptech/glide/load/p/b$a;)V

    invoke-direct {p1, v0}, Lcom/bumptech/glide/load/p/b;-><init>(Lcom/bumptech/glide/load/p/b$b;)V

    return-object p1
.end method
