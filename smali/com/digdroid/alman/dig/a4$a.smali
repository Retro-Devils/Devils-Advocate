.class Lcom/digdroid/alman/dig/a4$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a4;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/digdroid/alman/dig/a4;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a4;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a4$a;->b:Lcom/digdroid/alman/dig/a4;

    iput-object p2, p0, Lcom/digdroid/alman/dig/a4$a;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSystemUiVisibilityChange(I)V
    .locals 2

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/a4$a;->b:Lcom/digdroid/alman/dig/a4;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const/4 v0, 0x0

    const-string v1, "hide_navbar"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/a4$a;->a:Landroid/view/View;

    const/16 v0, 0xf06

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method
