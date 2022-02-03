.class Lcom/digdroid/alman/dig/f0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f0;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/EditText;

.field final synthetic c:Lcom/digdroid/alman/dig/f0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f0;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f0$c;->c:Lcom/digdroid/alman/dig/f0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/f0$c;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$c;->b:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/f0$c;->c:Lcom/digdroid/alman/dig/f0;

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/f0;->D3(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
