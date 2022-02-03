.class Lcom/jaredrummler/android/colorpicker/c$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/c;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field final synthetic c:I

.field final synthetic d:Lcom/jaredrummler/android/colorpicker/c;


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/c;Lcom/jaredrummler/android/colorpicker/ColorPanelView;I)V
    .locals 0

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$f;->d:Lcom/jaredrummler/android/colorpicker/c;

    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/c$f;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    iput p3, p0, Lcom/jaredrummler/android/colorpicker/c$f;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c$f;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/c$f;->c:I

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    return-void
.end method
