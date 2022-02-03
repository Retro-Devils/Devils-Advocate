.class Lcom/digdroid/alman/dig/b0$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/w2$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0$c;->b(Ljava/lang/Void;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/b0$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$c$a;->a:Lcom/digdroid/alman/dig/b0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$c$a;->a:Lcom/digdroid/alman/dig/b0$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0$c;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b0;->b(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    const-string v0, "share_stats"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/digdroid/alman/dig/b0$c$b;

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$c$a;->a:Lcom/digdroid/alman/dig/b0$c;

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/b0$c$b;-><init>(Lcom/digdroid/alman/dig/b0$c;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$c$a;->a:Lcom/digdroid/alman/dig/b0$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0$c;->d:Lcom/digdroid/alman/dig/b0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0;->j:Lcom/digdroid/alman/dig/b0$m;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/b0$m;->a()V

    :cond_1
    :goto_0
    return-void
.end method
