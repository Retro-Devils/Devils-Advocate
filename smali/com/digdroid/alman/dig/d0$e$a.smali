.class Lcom/digdroid/alman/dig/d0$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/android/billingclient/api/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$e;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/d0$e;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$e;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$e$a;->a:Lcom/digdroid/alman/dig/d0$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/g;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/g;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()I

    move-result v0

    const-string v1, "unlock_features"

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

    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$e$a;->a:Lcom/digdroid/alman/dig/d0$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$e;->b:Lcom/digdroid/alman/dig/d0;

    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/digdroid/alman/dig/d0;->j:Ljava/lang/String;

    invoke-static {}, Lcom/android/billingclient/api/f;->e()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/android/billingclient/api/f$a;->b(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/f$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$e$a;->a:Lcom/digdroid/alman/dig/d0$e;

    iget-object v2, v0, Lcom/digdroid/alman/dig/d0$e;->b:Lcom/digdroid/alman/dig/d0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$e;->a:Landroid/app/Activity;

    invoke-virtual {v2, v0, p2}, Lcom/android/billingclient/api/c;->d(Landroid/app/Activity;Lcom/android/billingclient/api/f;)Lcom/android/billingclient/api/g;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/d0$e$a;->a:Lcom/digdroid/alman/dig/d0$e;

    iget-object v0, p2, Lcom/digdroid/alman/dig/d0$e;->b:Lcom/digdroid/alman/dig/d0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/d0$e;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()I

    move-result p1

    invoke-static {v0, p2, p1, v1}, Lcom/digdroid/alman/dig/d0;->i(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;ILjava/lang/String;)V

    :cond_2
    return-void
.end method
