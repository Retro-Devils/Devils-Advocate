.class Lcom/digdroid/alman/dig/f$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/g/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/g/b<",
        "Lc/b/a/a/e/d$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f$d;->a:Lcom/digdroid/alman/dig/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lc/b/a/a/e/d$a;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/f$d;->b(Lc/b/a/a/e/d$a;)V

    return-void
.end method

.method public b(Lc/b/a/a/e/d$a;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lc/b/a/a/e/d$a;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/f$d;->a:Lcom/digdroid/alman/dig/f;

    invoke-static {v0, p1}, Lcom/digdroid/alman/dig/f;->c(Lcom/digdroid/alman/dig/f;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/f$d;->a:Lcom/digdroid/alman/dig/f;

    invoke-static {p1}, Lcom/digdroid/alman/dig/f;->b(Lcom/digdroid/alman/dig/f;)V

    return-void
.end method
