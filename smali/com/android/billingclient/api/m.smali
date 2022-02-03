.class final Lcom/android/billingclient/api/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:I

.field private final synthetic b:Lcom/android/billingclient/api/SkuDetails;

.field private final synthetic c:Ljava/lang/String;

.field private final synthetic d:Lcom/android/billingclient/api/f;

.field private final synthetic e:Landroid/os/Bundle;

.field private final synthetic f:Lcom/android/billingclient/api/d;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d;ILcom/android/billingclient/api/SkuDetails;Ljava/lang/String;Lcom/android/billingclient/api/f;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/m;->f:Lcom/android/billingclient/api/d;

    iput p2, p0, Lcom/android/billingclient/api/m;->a:I

    iput-object p3, p0, Lcom/android/billingclient/api/m;->b:Lcom/android/billingclient/api/SkuDetails;

    iput-object p4, p0, Lcom/android/billingclient/api/m;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/android/billingclient/api/m;->d:Lcom/android/billingclient/api/f;

    iput-object p6, p0, Lcom/android/billingclient/api/m;->e:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/android/billingclient/api/m;->f:Lcom/android/billingclient/api/d;

    invoke-static {v0}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/d;)Lc/b/a/a/d/c/a;

    move-result-object v1

    iget v2, p0, Lcom/android/billingclient/api/m;->a:I

    iget-object v0, p0, Lcom/android/billingclient/api/m;->f:Lcom/android/billingclient/api/d;

    invoke-static {v0}, Lcom/android/billingclient/api/d;->v(Lcom/android/billingclient/api/d;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/android/billingclient/api/m;->b:Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/android/billingclient/api/m;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/android/billingclient/api/m;->d:Lcom/android/billingclient/api/f;

    invoke-virtual {v0}, Lcom/android/billingclient/api/f;->q()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/android/billingclient/api/m;->e:Landroid/os/Bundle;

    invoke-interface/range {v1 .. v7}, Lc/b/a/a/d/c/a;->v0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
