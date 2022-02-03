.class Lcom/android/billingclient/api/e$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/e$c;->a()Ljava/lang/Void;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Exception;

.field final synthetic c:Lcom/android/billingclient/api/e$c;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/e$c;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e$c$a;->c:Lcom/android/billingclient/api/e$c;

    iput-object p2, p0, Lcom/android/billingclient/api/e$c$a;->b:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error acknowledge purchase; ex: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/android/billingclient/api/e$c$a;->b:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingClient"

    invoke-static {v1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/billingclient/api/e$c$a;->c:Lcom/android/billingclient/api/e$c;

    iget-object v0, v0, Lcom/android/billingclient/api/e$c;->b:Lcom/android/billingclient/api/b;

    sget-object v1, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    invoke-interface {v0, v1}, Lcom/android/billingclient/api/b;->a(Lcom/android/billingclient/api/h;)V

    return-void
.end method
