.class Lcom/digdroid/alman/dig/d0$d$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/android/billingclient/api/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$d$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/d0$d$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$d$a$a;->a:Lcom/digdroid/alman/dig/d0$d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/h;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/h;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->c()I

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/SkuDetails;

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d$a$a;->a:Lcom/digdroid/alman/dig/d0$d$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$d$a;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d$a$a;->a:Lcom/digdroid/alman/dig/d0$d$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$d$a;->b:Lcom/digdroid/alman/dig/d0$d;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/digdroid/alman/dig/d0;->k:Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/g;->p()Lcom/android/billingclient/api/g$b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/android/billingclient/api/g$b;->b(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/g$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/billingclient/api/g$b;->a()Lcom/android/billingclient/api/g;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$d$a$a;->a:Lcom/digdroid/alman/dig/d0$d$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$d$a;->b:Lcom/digdroid/alman/dig/d0$d;

    iget-object v1, v0, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$d;->a:Landroid/app/Activity;

    invoke-virtual {v1, v0, p2}, Lcom/android/billingclient/api/d;->d(Landroid/app/Activity;Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/d0$d$a$a;->a:Lcom/digdroid/alman/dig/d0$d$a;

    iget-object p2, p2, Lcom/digdroid/alman/dig/d0$d$a;->b:Lcom/digdroid/alman/dig/d0$d;

    iget-object v0, p2, Lcom/digdroid/alman/dig/d0$d;->b:Lcom/digdroid/alman/dig/d0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/d0$d;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->c()I

    move-result p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0$d$a$a;->a:Lcom/digdroid/alman/dig/d0$d$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/d0$d$a;->a:Ljava/lang/String;

    invoke-static {v0, p2, p1, v1}, Lcom/digdroid/alman/dig/d0;->i(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;ILjava/lang/String;)V

    :cond_2
    return-void
.end method
