.class final Lcom/bumptech/glide/load/o/b0/j$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/t/l/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/o/b0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final b:Ljava/security/MessageDigest;

.field private final c:Lcom/bumptech/glide/t/l/c;


# direct methods
.method constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/bumptech/glide/t/l/c;->a()Lcom/bumptech/glide/t/l/c;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/o/b0/j$b;->c:Lcom/bumptech/glide/t/l/c;

    iput-object p1, p0, Lcom/bumptech/glide/load/o/b0/j$b;->b:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public e()Lcom/bumptech/glide/t/l/c;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/b0/j$b;->c:Lcom/bumptech/glide/t/l/c;

    return-object v0
.end method
