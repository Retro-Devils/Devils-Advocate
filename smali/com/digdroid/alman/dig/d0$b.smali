.class Lcom/digdroid/alman/dig/d0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->l(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/d0$q;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;Lcom/digdroid/alman/dig/d0$q;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$b;->c:Lcom/digdroid/alman/dig/d0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$b;->a:Lcom/digdroid/alman/dig/d0$q;

    iput-object p3, p0, Lcom/digdroid/alman/dig/d0$b;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$b;->c:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$b;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/d0$q;->a()V

    return-void

    :cond_0
    const-string v1, "inapp"

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/d;->f(Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase$a;->c()I

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase$a;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    iget-object v3, p0, Lcom/digdroid/alman/dig/d0$b;->c:Lcom/digdroid/alman/dig/d0;

    iget-object v4, p0, Lcom/digdroid/alman/dig/d0$b;->b:Landroid/app/Activity;

    invoke-virtual {v3, v4, v2}, Lcom/digdroid/alman/dig/d0;->z(Landroid/app/Activity;Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$b;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/d0$q;->a()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$b;->c:Lcom/digdroid/alman/dig/d0;

    iget-object v2, v0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    if-eqz v2, :cond_3

    invoke-static {v0}, Lcom/digdroid/alman/dig/d0;->f(Lcom/digdroid/alman/dig/d0;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$b;->c:Lcom/digdroid/alman/dig/d0;

    iget-object v2, v0, Lcom/digdroid/alman/dig/d0;->j:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->k:Ljava/lang/String;

    if-nez v0, :cond_3

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "unlock_features"

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "features12"

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/android/billingclient/api/l;->e()Lcom/android/billingclient/api/l$b;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/l$b;->b(Ljava/util/List;)Lcom/android/billingclient/api/l$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/l$b;->c(Ljava/lang/String;)Lcom/android/billingclient/api/l$b;

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$b;->c:Lcom/digdroid/alman/dig/d0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    invoke-virtual {v2}, Lcom/android/billingclient/api/l$b;->a()Lcom/android/billingclient/api/l;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/d0$b$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/d0$b$a;-><init>(Lcom/digdroid/alman/dig/d0$b;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/d;->g(Lcom/android/billingclient/api/l;Lcom/android/billingclient/api/m;)V

    :cond_3
    return-void
.end method

.method public b(I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$b;->a:Lcom/digdroid/alman/dig/d0$q;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/d0$q;->a()V

    return-void
.end method
