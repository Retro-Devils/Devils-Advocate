.class Lcom/digdroid/alman/dig/y$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/d/a/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/d/a/b<",
        "Lcom/digdroid/alman/dig/y$m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/y;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$a;->a:Lcom/digdroid/alman/dig/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/digdroid/alman/dig/y$m;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/y$a;->b(Lcom/digdroid/alman/dig/y$m;)V

    return-void
.end method

.method public b(Lcom/digdroid/alman/dig/y$m;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$a;->a:Lcom/digdroid/alman/dig/y;

    invoke-static {v0}, Lcom/digdroid/alman/dig/y;->a(Lcom/digdroid/alman/dig/y;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/y$m;->b(Ljava/lang/String;)V

    return-void
.end method
