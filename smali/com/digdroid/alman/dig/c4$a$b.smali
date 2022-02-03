.class Lcom/digdroid/alman/dig/c4$a$b;
.super Landroid/webkit/WebViewClient;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/c4$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/c4$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/c4$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/c4$a$b;->a:Lcom/digdroid/alman/dig/c4$a;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/c4$a$b;->a:Lcom/digdroid/alman/dig/c4$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/c4$a;->b:Lcom/digdroid/alman/dig/c4;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/c4;->i3(Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
