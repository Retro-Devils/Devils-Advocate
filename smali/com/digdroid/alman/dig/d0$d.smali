.class Lcom/digdroid/alman/dig/d0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->I(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$d;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string v1, "features78"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "features12"

    const-string v3, "features34"

    const-string v4, "features56"

    if-eqz v0, :cond_0

    const-string v1, "features910"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v1, v4

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v1, v3

    goto :goto_0

    :cond_3
    move-object v1, v2

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    invoke-static {v0}, Lcom/digdroid/alman/dig/d0;->b(Lcom/digdroid/alman/dig/d0;)Lcom/digdroid/alman/dig/n;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d;->a:Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/d0;->c(Lcom/digdroid/alman/dig/d0;Landroid/content/Context;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d;->a:Landroid/app/Activity;

    new-instance v2, Lcom/digdroid/alman/dig/d0$d$a;

    invoke-direct {v2, p0, v1}, Lcom/digdroid/alman/dig/d0$d$a;-><init>(Lcom/digdroid/alman/dig/d0$d;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v2}, Lcom/digdroid/alman/dig/d0;->G(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$p;)V

    return-void
.end method
