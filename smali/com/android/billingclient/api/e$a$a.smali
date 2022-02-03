.class Lcom/android/billingclient/api/e$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/e$a;->a()Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/android/billingclient/api/SkuDetails$a;

.field final synthetic c:Lcom/android/billingclient/api/e$a;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/e$a;Lcom/android/billingclient/api/SkuDetails$a;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e$a$a;->c:Lcom/android/billingclient/api/e$a;

    iput-object p2, p0, Lcom/android/billingclient/api/e$a$a;->b:Lcom/android/billingclient/api/SkuDetails$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/e$a$a;->c:Lcom/android/billingclient/api/e$a;

    iget-object v0, v0, Lcom/android/billingclient/api/e$a;->c:Lcom/android/billingclient/api/m;

    invoke-static {}, Lcom/android/billingclient/api/h;->d()Lcom/android/billingclient/api/h$b;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/e$a$a;->b:Lcom/android/billingclient/api/SkuDetails$a;

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails$a;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/h$b;->c(I)Lcom/android/billingclient/api/h$b;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/e$a$a;->b:Lcom/android/billingclient/api/SkuDetails$a;

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/h$b;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/h$b;->a()Lcom/android/billingclient/api/h;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/e$a$a;->b:Lcom/android/billingclient/api/SkuDetails$a;

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails$a;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/android/billingclient/api/m;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-void
.end method
