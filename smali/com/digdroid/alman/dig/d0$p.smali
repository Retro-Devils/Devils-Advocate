.class Lcom/digdroid/alman/dig/d0$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/android/billingclient/api/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->G(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/d0$q;

.field final synthetic b:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;Lcom/digdroid/alman/dig/d0$q;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$p;->b:Lcom/digdroid/alman/dig/d0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$p;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$p;->b:Lcom/digdroid/alman/dig/d0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d0;->n()V

    return-void
.end method

.method public b(Lcom/android/billingclient/api/g;)V
    .locals 2

    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()I

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$p;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/d0$q;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$p;->b:Lcom/digdroid/alman/dig/d0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/d0;->g(Lcom/digdroid/alman/dig/d0;Z)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$p;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/d0$q;->b(I)V

    :catch_0
    :goto_1
    return-void
.end method
