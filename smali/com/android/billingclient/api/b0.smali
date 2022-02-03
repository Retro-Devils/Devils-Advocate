.class final Lcom/android/billingclient/api/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Ljava/lang/String;

.field private final synthetic b:Ljava/util/List;

.field private final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/android/billingclient/api/j;

.field private final synthetic e:Lcom/android/billingclient/api/d;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/android/billingclient/api/j;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/b0;->e:Lcom/android/billingclient/api/d;

    iput-object p2, p0, Lcom/android/billingclient/api/b0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/b0;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/android/billingclient/api/b0;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/android/billingclient/api/b0;->d:Lcom/android/billingclient/api/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/android/billingclient/api/b0;->e:Lcom/android/billingclient/api/d;

    iget-object v1, p0, Lcom/android/billingclient/api/b0;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/billingclient/api/b0;->b:Ljava/util/List;

    iget-object v3, p0, Lcom/android/billingclient/api/b0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/android/billingclient/api/d;->m(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails$a;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/b0;->e:Lcom/android/billingclient/api/d;

    new-instance v2, Lcom/android/billingclient/api/e0;

    invoke-direct {v2, p0, v0}, Lcom/android/billingclient/api/e0;-><init>(Lcom/android/billingclient/api/b0;Lcom/android/billingclient/api/SkuDetails$a;)V

    invoke-static {v1, v2}, Lcom/android/billingclient/api/d;->s(Lcom/android/billingclient/api/d;Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    return-object v0
.end method
