.class Lcom/digdroid/alman/dig/d0$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/android/billingclient/api/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$c;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/d0$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$c$a;->a:Lcom/digdroid/alman/dig/d0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/android/billingclient/api/g;Ljava/util/List;)V
    .locals 2
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

    move-result p1

    if-nez p1, :cond_2

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

    const-string v1, "unlock_features"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$c$a;->a:Lcom/digdroid/alman/dig/d0$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$c;->c:Lcom/digdroid/alman/dig/d0;

    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/digdroid/alman/dig/d0;->j:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-string v1, "features12"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$c$a;->a:Lcom/digdroid/alman/dig/d0$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$c;->c:Lcom/digdroid/alman/dig/d0;

    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lcom/digdroid/alman/dig/d0;->k:Ljava/lang/String;

    goto :goto_0

    :cond_2
    return-void
.end method
