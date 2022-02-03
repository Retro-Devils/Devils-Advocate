.class Lcom/jaredrummler/android/colorpicker/b$b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/b$b;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/jaredrummler/android/colorpicker/b$b;


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b$b;->b:Lcom/jaredrummler/android/colorpicker/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 0

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b$b;->b:Lcom/jaredrummler/android/colorpicker/b$b;

    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d()V

    const/4 p1, 0x1

    return p1
.end method
