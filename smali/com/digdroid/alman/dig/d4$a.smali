.class Lcom/digdroid/alman/dig/d4$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d4;->r1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/digdroid/alman/dig/d4;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d4;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d4$a;->b:Lcom/digdroid/alman/dig/d4;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d4$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/d4$a;->b:Lcom/digdroid/alman/dig/d4;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d4;->g3()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/d4$a;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/digdroid/alman/dig/d4$a;->b:Lcom/digdroid/alman/dig/d4;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->m2(Landroid/content/Intent;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/digdroid/alman/dig/d4$a$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/d4$a$a;-><init>(Lcom/digdroid/alman/dig/d4$a;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d4$a;->b:Lcom/digdroid/alman/dig/d4;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d4;->n0:Landroid/webkit/WebView;

    new-instance v1, Lcom/digdroid/alman/dig/d4$a$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/d4$a$b;-><init>(Lcom/digdroid/alman/dig/d4$a;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d4$a;->b:Lcom/digdroid/alman/dig/d4;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d4;->n0:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d4$a;->b:Lcom/digdroid/alman/dig/d4;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d4;->n0:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/d4$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
