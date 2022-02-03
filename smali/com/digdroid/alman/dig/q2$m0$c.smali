.class Lcom/digdroid/alman/dig/q2$m0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2$m0;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/q2$m0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2$m0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$m0$c;->b:Lcom/digdroid/alman/dig/q2$m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$m0$c;->b:Lcom/digdroid/alman/dig/q2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$m0;->b:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$m0$c;->b:Lcom/digdroid/alman/dig/q2$m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2$m0;->d:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q2;->r0:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroidx/appcompat/app/g;->dismiss()V

    return-void
.end method
