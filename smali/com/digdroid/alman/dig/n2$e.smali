.class Lcom/digdroid/alman/dig/n2$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfr/bmartel/youtubetv/g/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/n2;->a(Lc/b/a/c/a/c$d;Lc/b/a/c/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/n2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/n2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfr/bmartel/youtubetv/h/g;JFFLfr/bmartel/youtubetv/h/e;)V
    .locals 0

    iget-object p2, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    iget-boolean p3, p2, Lcom/digdroid/alman/dig/n2;->h:Z

    if-eqz p3, :cond_0

    sget-object p3, Lfr/bmartel/youtubetv/h/g;->d:Lfr/bmartel/youtubetv/h/g;

    if-ne p1, p3, :cond_0

    iget-object p2, p2, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {p2}, Lcom/digdroid/alman/dig/n2$g;->b()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {p2}, Lcom/digdroid/alman/dig/n2;->d(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/n2;->d(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/n2;->f(Lcom/digdroid/alman/dig/n2;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/n2$g;->a()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/n2;->w()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/n2;->k(Lcom/digdroid/alman/dig/n2;)Landroid/widget/RelativeLayout;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/n2$e$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/n2$e$a;-><init>(Lcom/digdroid/alman/dig/n2$e;)V

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/n2;->j(Lcom/digdroid/alman/dig/n2;)Landroid/widget/RelativeLayout;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    :cond_0
    sget-object p2, Lfr/bmartel/youtubetv/h/g;->c:Lfr/bmartel/youtubetv/h/g;

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/n2;->f(Lcom/digdroid/alman/dig/n2;Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lfr/bmartel/youtubetv/h/e;)V
    .locals 0

    return-void
.end method
