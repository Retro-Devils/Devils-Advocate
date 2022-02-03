.class Lc/b/a/b/z/g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/b/z/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/a/b/z/g;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lc/b/a/b/z/g;


# direct methods
.method constructor <init>(Lc/b/a/b/z/g;F)V
    .locals 0

    iput-object p1, p0, Lc/b/a/b/z/g$b;->b:Lc/b/a/b/z/g;

    iput p2, p0, Lc/b/a/b/z/g$b;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/a/b/z/c;)Lc/b/a/b/z/c;
    .locals 2

    instance-of v0, p1, Lc/b/a/b/z/i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lc/b/a/b/z/b;

    iget v1, p0, Lc/b/a/b/z/g$b;->a:F

    invoke-direct {v0, v1, p1}, Lc/b/a/b/z/b;-><init>(FLc/b/a/b/z/c;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
