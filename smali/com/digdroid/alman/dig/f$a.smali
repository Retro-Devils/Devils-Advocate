.class Lcom/digdroid/alman/dig/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/c/p$b<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f$a;->a:Lcom/digdroid/alman/dig/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/f$a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f$a;->a:Lcom/digdroid/alman/dig/f;

    const-string v1, "token"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/f;->a(Lcom/digdroid/alman/dig/f;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/f$a;->a:Lcom/digdroid/alman/dig/f;

    invoke-static {p1}, Lcom/digdroid/alman/dig/f;->b(Lcom/digdroid/alman/dig/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/f$a;->a:Lcom/digdroid/alman/dig/f;

    invoke-static {p1}, Lcom/digdroid/alman/dig/f;->b(Lcom/digdroid/alman/dig/f;)V

    :goto_0
    return-void
.end method
