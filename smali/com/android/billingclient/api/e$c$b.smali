.class Lcom/android/billingclient/api/e$c$b;
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
.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/android/billingclient/api/e$c;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/e$c;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e$c$b;->d:Lcom/android/billingclient/api/e$c;

    iput p2, p0, Lcom/android/billingclient/api/e$c$b;->b:I

    iput-object p3, p0, Lcom/android/billingclient/api/e$c$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/e$c$b;->d:Lcom/android/billingclient/api/e$c;

    iget-object v0, v0, Lcom/android/billingclient/api/e$c;->b:Lcom/android/billingclient/api/b;

    invoke-static {}, Lcom/android/billingclient/api/h;->d()Lcom/android/billingclient/api/h$b;

    move-result-object v1

    iget v2, p0, Lcom/android/billingclient/api/e$c$b;->b:I

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/h$b;->c(I)Lcom/android/billingclient/api/h$b;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/e$c$b;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/h$b;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/billingclient/api/h$b;->a()Lcom/android/billingclient/api/h;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/billingclient/api/b;->a(Lcom/android/billingclient/api/h;)V

    return-void
.end method
