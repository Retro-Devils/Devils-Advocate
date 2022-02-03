.class Lcom/android/billingclient/api/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/e;->g(Lcom/android/billingclient/api/l;Lcom/android/billingclient/api/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/android/billingclient/api/m;

.field final synthetic d:Lcom/android/billingclient/api/e;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/e;Ljava/lang/String;Ljava/util/List;Lcom/android/billingclient/api/m;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e$a;->d:Lcom/android/billingclient/api/e;

    iput-object p2, p0, Lcom/android/billingclient/api/e$a;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/e$a;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/android/billingclient/api/e$a;->c:Lcom/android/billingclient/api/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/e$a;->d:Lcom/android/billingclient/api/e;

    iget-object v1, p0, Lcom/android/billingclient/api/e$a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/android/billingclient/api/e$a;->b:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/e;->C(Ljava/lang/String;Ljava/util/List;)Lcom/android/billingclient/api/SkuDetails$a;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/e$a;->d:Lcom/android/billingclient/api/e;

    new-instance v2, Lcom/android/billingclient/api/e$a$a;

    invoke-direct {v2, p0, v0}, Lcom/android/billingclient/api/e$a$a;-><init>(Lcom/android/billingclient/api/e$a;Lcom/android/billingclient/api/SkuDetails$a;)V

    invoke-static {v1, v2}, Lcom/android/billingclient/api/e;->w(Lcom/android/billingclient/api/e;Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
