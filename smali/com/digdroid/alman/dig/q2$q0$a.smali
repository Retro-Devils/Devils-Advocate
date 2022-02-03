.class Lcom/digdroid/alman/dig/q2$q0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2$q0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/q2$q0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2$q0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$q0$a;->b:Lcom/digdroid/alman/dig/q2$q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$q0$a;->b:Lcom/digdroid/alman/dig/q2$q0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$q0;->d:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string p2, "wifi_only"

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$q0$a;->b:Lcom/digdroid/alman/dig/q2$q0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$q0;->d:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    return-void
.end method
