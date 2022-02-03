.class Lcom/digdroid/alman/dig/d0$d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$d;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/digdroid/alman/dig/d0$d;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$d$a;->b:Lcom/digdroid/alman/dig/d0$d;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$d$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0$d$a;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0$d$a;->b:Lcom/digdroid/alman/dig/d0$d;

    iget-object v1, v1, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0$d$a;->a:Ljava/lang/String;

    iput-object v2, v1, Lcom/digdroid/alman/dig/d0;->n:Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/l;->e()Lcom/android/billingclient/api/l$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/billingclient/api/l$b;->b(Ljava/util/List;)Lcom/android/billingclient/api/l$b;

    move-result-object v0

    const-string v2, "inapp"

    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/l$b;->c(Ljava/lang/String;)Lcom/android/billingclient/api/l$b;

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d$a;->b:Lcom/digdroid/alman/dig/d0$d;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/android/billingclient/api/l$b;->a()Lcom/android/billingclient/api/l;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/d0$d$a$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/d0$d$a$a;-><init>(Lcom/digdroid/alman/dig/d0$d$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/d;->g(Lcom/android/billingclient/api/l;Lcom/android/billingclient/api/m;)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d$a;->b:Lcom/digdroid/alman/dig/d0$d;

    iget-object v1, v0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$d;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0$d$a;->a:Ljava/lang/String;

    invoke-static {v1, v0, p1, v2}, Lcom/digdroid/alman/dig/d0;->i(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;ILjava/lang/String;)V

    return-void
.end method
