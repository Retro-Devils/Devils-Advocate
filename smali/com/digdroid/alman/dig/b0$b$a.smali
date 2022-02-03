.class Lcom/digdroid/alman/dig/b0$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/v2$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0$b;->b(Ljava/lang/Void;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/b0$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$b$a;->a:Lcom/digdroid/alman/dig/b0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b$a;->a:Lcom/digdroid/alman/dig/b0$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b0;->b(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    const-string v0, "share_stats"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/digdroid/alman/dig/b0$b$b;

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$b$a;->a:Lcom/digdroid/alman/dig/b0$b;

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/b0$b$b;-><init>(Lcom/digdroid/alman/dig/b0$b;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b$a;->a:Lcom/digdroid/alman/dig/b0$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0;->j:Lcom/digdroid/alman/dig/b0$k;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/b0$k;->a()V

    :cond_1
    :goto_0
    return-void
.end method
